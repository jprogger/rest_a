package com.example.rest_a.model;

import com.example.rest_a.model.service.RestService;
import com.foxykeep.datadroid.requestmanager.RequestManager;

import android.content.Context;

public final class RestRequestManager extends RequestManager {
	private RestRequestManager(Context context) {
		super(context, RestService.class);
	}
	
	private static RestRequestManager sInstance;
	
	public static RestRequestManager from(Context context) {
		if (sInstance == null) {
			sInstance = new RestRequestManager(context);
		}
		return sInstance;
	}
}
