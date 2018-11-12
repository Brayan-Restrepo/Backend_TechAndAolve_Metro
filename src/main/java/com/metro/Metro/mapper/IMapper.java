package com.metro.metro.mapper;

import java.lang.reflect.Type;

public interface IMapper {
	
	public <T> T map(Object source, Class<T> destinationType);
	
	public <T> T map(Object source, Type destinationType);

}
