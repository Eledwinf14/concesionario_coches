package com.concesionarioCoches.domain.useCase;

import com.concesionarioCoches.domain.dto.AuthCustomerDto;
import com.concesionarioCoches.domain.dto.JwtResponseDto;

public interface IAuthUseCase {

    JwtResponseDto signIn(AuthCustomerDto authCustomerDto);

    JwtResponseDto signOut(String jwt);
}
