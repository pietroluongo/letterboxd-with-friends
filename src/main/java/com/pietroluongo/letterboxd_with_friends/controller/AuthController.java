// package com.pietroluongo.letterboxd_with_friends.controller;

// import java.util.Map;

// import org.slf4j.LoggerFactory;
// import org.slf4j.Logger;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.security.authentication.AuthenticationManager;
// import
// org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
// import org.springframework.security.core.context.SecurityContextHolder;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.pietroluongo.letterboxd_with_friends.dto.LoginRequest;

// import jakarta.servlet.http.HttpServletRequest;
// import jakarta.servlet.http.HttpSession;

// @RestController
// public class AuthController {
// @Autowired
// private final AuthenticationManager authManager;
// private Logger logger = LoggerFactory.getLogger("authLogger");

// public AuthController(AuthenticationManager authManager) {
// this.authManager = authManager;
// }

// @PostMapping("/login")
// public ResponseEntity<Map<String, String>> login(@RequestBody LoginRequest
// body, HttpServletRequest request) {
// logger.info(String.format("Requested login with data %s", body));
// return ResponseEntity.ok(Map.of("", ""));
// // final var auth = authManager
// // .authenticate(new UsernamePasswordAuthenticationToken(body.username(),
// // body.password()));
// // final var securityContext = SecurityContextHolder.getContext();
// // securityContext.setAuthentication(auth);
// // final var session = request.getSession(true);
// // session.setAttribute("SPRING_SECURITY_CONTEXT", securityContext);

// // return ResponseEntity.ok(Map.of("message", "OK", "sessionId",
// // session.getId()));
// }

// @GetMapping("/me")
// public ResponseEntity<String> getCurrentUsername() {
// var auth = SecurityContextHolder.getContext().getAuthentication();
// return ResponseEntity.ok(auth.getName());
// }

// }
