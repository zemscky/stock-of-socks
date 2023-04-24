package com.example.stockofsocks.service;

import com.example.stockofsocks.constant.StockOperation;
import com.example.stockofsocks.dto.SocksDto;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface SocksService {

    SocksDto postIncome(SocksDto sock);
    SocksDto postOutcome(SocksDto sock);
    Collection<SocksDto> getSocks(String color, StockOperation operation, int cottonPart);
}
