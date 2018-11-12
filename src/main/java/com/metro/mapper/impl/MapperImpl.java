package com.metro.mapper.impl;

import java.lang.reflect.Type;

import com.metro.mapper.IMapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

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
