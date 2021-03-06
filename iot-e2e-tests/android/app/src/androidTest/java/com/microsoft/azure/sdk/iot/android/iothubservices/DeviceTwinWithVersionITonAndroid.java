/*
 *  Copyright (c) Microsoft. All rights reserved.
 *  Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.microsoft.azure.sdk.iot.android.iothubservices;

import com.microsoft.appcenter.espresso.Factory;
import com.microsoft.appcenter.espresso.ReportHelper;
import com.microsoft.azure.sdk.iot.android.BuildConfig;
import com.microsoft.azure.sdk.iot.common.iothubservices.DeviceTwinWithVersionCommon;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;

import java.io.IOException;

public class DeviceTwinWithVersionITonAndroid extends DeviceTwinWithVersionCommon
{
    @Rule
    public ReportHelper reportHelper = Factory.getReportHelper();

    @BeforeClass
    public static void setup() throws IOException
    {
        iotHubConnectionString = BuildConfig.IotHubConnectionString;
        DeviceTwinWithVersionCommon.setUp();
    }
}
