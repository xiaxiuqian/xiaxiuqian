package com.shz.demo.utils.common;

import java.util.UUID;

public class UUIDUtils {

	public static String getUUID(){
        return UUID.randomUUID().toString().replace("-", "");
   }
}
