package com.grpc.app.service;

import com.grpc.app.entity.Users;
import com.grpc.app.repository.interfaceRepository.UsersRepositoryInterface;
import com.grpc.app.utils.requestDto.authRequestDto;
import com.grpc.app.utils.responeDto.authResponseDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
//@AllArgsConstructor
public class AppService{
    private final ResponeService responeService;
    private final AuthenticationManager authenticationManager;
    private final UsersRepositoryInterface usersRepositoryInterface;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    public ResponseEntity signInService (authRequestDto authRequest){
//       Users Us =  new Users();
//       Us.setPassword(bCryptPasswordEncoder
//               .encode(authRequest.getPassword()));
//       Us.setEmail("isemail@mail.com");
//       Us.setUserName("US-MXS");
//       usersRepositoryInterface.save(Us);
        authResponseDto authResponse = new authResponseDto();
//        authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(
//                        authRequest.getUserName(),
//                        authRequest.getPassword()
//                )
//        );
//        var userData = usersRepositoryInterface.findByUserName(authRequest.getUserName())
//                .orElseThrow();
//        System.out.println("userData "+ userData);
//        var jwtToken = jwtService.generateToken(user);
//        revokeAllUserTokens(user);
//        saveUserToken(user, jwtToken);
//        return AuthenticationResponse.builder()
//                .token(jwtToken)
//                .build();

        return ResponseEntity.status(201).body(responeService.GetServiceObject(true,"",authResponse));

    }
}
