package com.metro.metro.mapper.impl;

import java.lang.reflect.Type;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.metro.metro.mapper.IMapper;

@Service
public class MapperImpl implements IMapper {
	
	private ModelMapper modelMapper;
	public MapperImpl() {
		
		this.modelMapper = new ModelMapper();
		
	}
	
	public <T> T map(Object source, Class<T> destinationType) {
		
		return modelMapper.map(source, destinationType);
	}
	
	public <T> T map(Object source, Type destinationType) {
		
		return modelMapper.map(source, destinationType);
	}
}
