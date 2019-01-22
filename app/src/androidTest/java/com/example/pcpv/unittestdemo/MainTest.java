package com.example.pcpv.unittestdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MainTest {
    @Mock
    private Context mContext;
    @Mock
    private MainActivity mainActivity;

    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testIntentCreated() {
        // assign value to getName
        when(mainActivity.getName()).thenReturn("abc");

        Intent intent = MainActivity.createNewIntent(mContext, mainActivity.getName());
        Assert.assertNotNull(intent);
        Bundle bundle = intent.getExtras();
        // check value
        Assert.assertEquals("abc", bundle.getString("USER"));
    }

    @Test
    public void verifyString() {
        mainActivity.doSomeThings("abc");
        // check if method was called or not
        verify(mainActivity).doSomeThings("abc");
        // check if method was called 1 time or not
        verify(mainActivity, times(0)).doSomeThings("abc");
        // check if method was called at least 1 time or not
        verify(mainActivity, atLeast(1)).doSomeThings("abc");
        // check if method was called at most 10 times or not
        verify(mainActivity, atMost(10)).doSomeThings("abc");
    }
}
