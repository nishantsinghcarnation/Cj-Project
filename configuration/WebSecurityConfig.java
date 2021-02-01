package com.cts.cj.configuration;

//import static com.cardinal.gc.base.utils.Constants.SKIP_API_SECURITY;

import javax.annotation.Resource;

//import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.session.SessionManagementFilter;
import org.springframework.web.client.RestTemplate;

//import com.cardinal.gc.base.utils.DefaultPassword;
//import com.cardinal.gc.base.utils.GCUtil;;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true,securedEnabled = true, 
jsr250Enabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Value("${i2i.secure.context_path}")
	private String secureContextPath;
	@Value("${i2i.non_secure.context_path}")
	private String nonsecureContextPath;

    @Resource(name = "userService")
    private UserDetailsService userDetailsService;

    @Autowired
    private JwtAuthenticationEntryPoint unauthorizedHandler;

    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Autowired
    public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService)
                .passwordEncoder(encoder());
    }

    @Bean
    public JwtAuthenticationFilter authenticationTokenFilterBean() throws Exception {
        return new JwtAuthenticationFilter();
    }

	
	  @Override 
	  public void configure(WebSecurity web) throws Exception {
		  web.ignoring().antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/images/**","/nonsecure/**");	 
 }
	 
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	http.addFilterBefore(cors(),SessionManagementFilter.class).csrf().disable().
                authorizeRequests().antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
                .antMatchers("/" + secureContextPath + "/users/validateUser/**")
        		.access("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')").antMatchers("/" + nonsecureContextPath + "/**").
        		access("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')").antMatchers("/" + secureContextPath +"/**").permitAll().
        		antMatchers("/itoiapi-websocket/**").permitAll().
                antMatchers("/h2-console/**","/v2/api-docs", "/configuration/**", "/swagger*/**", "/webjars/**").              // .permitAll().antMatchers("gc/setPassword").permitAll().               
                permitAll().anyRequest().authenticated().and()
                .exceptionHandling().authenticationEntryPoint(unauthorizedHandler).and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        		http.addFilterBefore(authenticationTokenFilterBean(), UsernamePasswordAuthenticationFilter.class);
        		
    }
    
   

    @Bean  
      public BCryptPasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }
    
    @Bean  
    public SimpleCORSFilter cors() {
      return new SimpleCORSFilter();
  }
   	
    @Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
    
    
    
	/*
	 * @Bean public JwtConfig jwtConfig() { return new JwtConfig(); }
	 */

}
