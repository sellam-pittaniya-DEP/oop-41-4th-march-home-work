package lk.ijse.sms.app;

import com.netflix.ribbon.api.RibbonGateway;
import com.netflix.ribbon.api.RibbonService;
import com.netflix.zuul.service.ApiGateway;

public class AppInitializer {
    ApiGateway apiGateway;
    RibbonService ribbonService;
    RibbonGateway ribbonGateway;
}
