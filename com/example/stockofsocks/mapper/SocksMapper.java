package com.example.stockofsocks.mapper;

import com.example.stockofsocks.dto.SocksDto;
import com.example.stockofsocks.entity.Socks;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SocksMapper {

    SocksDto toDto(Socks sock);
    Socks toEntity(SocksDto socksDto);
}
