package com.example.stockofsocks.service;

import com.example.stockofsocks.constant.StockOperation;
import com.example.stockofsocks.dto.SocksDto;
import com.example.stockofsocks.mapper.SocksMapper;
import com.example.stockofsocks.repository.SocksRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class SocksServiceImpl implements SocksService {

    private final SocksRepository socksRepository;
    private final SocksMapper socksMapper;

    public SocksServiceImpl(SocksRepository socksRepository, SocksMapper socksMapper) {
        this.socksRepository = socksRepository;
        this.socksMapper = socksMapper;
    }

    @Override
    public SocksDto postIncome(SocksDto sock) {
        return null;
    }

    @Override
    public SocksDto postOutcome(SocksDto sock) {
        return null;
    }

    @Override
    public Collection<SocksDto> getSocks(String color, StockOperation operation, int cottonPart) {
        return null;
    }
}
