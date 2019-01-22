package com.example.pcpv.unittestdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class MainTest {
    @Mock
    Context mContext;

    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testIntentCreated() {
        Intent intent = MainActivity.createNewIntent(mContext, "viet");
        Assert.assertNotNull(intent);

        Bundle bundle = getBundle(intent);
        Assert.assertEquals("viet", bundle.getString("USER"));
    }

    private Bundle getBundle(Intent intent) {
        return intent.getExtras();
    }
}
