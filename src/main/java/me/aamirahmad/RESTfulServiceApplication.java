package me.aamirahmad;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class RESTfulServiceApplication extends Application<RESTfulServiceConfiguration> {

    public static void main(final String[] args) throws Exception {
        new RESTfulServiceApplication().run(args);
    }

    @Override
    public String getName() {
        return "RESTfulService";
    }

    @Override
    public void initialize(final Bootstrap<RESTfulServiceConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final RESTfulServiceConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
