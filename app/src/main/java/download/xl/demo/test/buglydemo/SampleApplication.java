package download.xl.demo.test.buglydemo;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * *
 */
public class SampleApplication extends TinkerApplication {
    public SampleApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "download.xl.demo.test.buglydemo.SampleApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}
