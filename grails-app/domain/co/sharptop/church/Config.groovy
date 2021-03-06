package co.sharptop.church

class Config {

    String appName
    String appURL
    String liveStreamLinkId

    static constraints = {
    }

    static mapping = {
        appURL column: 'app_url'
    }

    static getCurrent() {
        list().first()
    }

    static initializeData() {
        new Config(
            appName: "TRBC Connect",
            appURL: "http://localhost:9000",
            liveStreamLinkId: "4DCKfXk6W4IakA42AyUyGy"
        ).save(failOnError: true)
    }

}
