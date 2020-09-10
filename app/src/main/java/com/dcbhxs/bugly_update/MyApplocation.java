package com.dcbhxs.bugly_update;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * <pre>
 * +title:
 * + desc:
 * + Author: hexiaosong@gogpay.cn
 * + Created: 2020-09-10
 * </pre>
 */
public class MyApplocation extends TinkerApplication {

    public MyApplocation() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.dcbhxs.bugly_update.SampleApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}
