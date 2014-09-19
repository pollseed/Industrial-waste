package jp.com.koto.constant;

/**
 * SNSの定数（未完成）
 * 
 * @author PollSeed
 *
 */
public enum SnsConstant implements IConstant<Long> {

    /* ジャンルを限定しない */
    GREE(10L, "グリー株式会社", "http://gree.jp/"),
    MIXI(20L, "mixi", "https://mixi.jp/"),
    LINE(30L, "LINE株式会社", "http://line.me/"),
    // TODO AMEBAというSNSではない？
    // AMEBA(40L, "サイバーエージェント", "http://ameblo.jp/"),

    /* モバイル特化 */
    MOBAGE(100L, "株式会社ディー・エヌ・エー", "http://www.mbga.jp/"),

    /* ゲーム */
    MIIVERSE(200L, "任天堂", "https://miiverse.nintendo.net/"),

    /* 趣味・娯楽 */
    MINKABU(1000L, "株式会社みんかぶ", "http://minkabu.jp/"),
    NEKOJIRUSHI(2000L, "株式会社CAT", "http://www.neko-jirushi.com/"),
    MINKARA(3000L, "株式会社カービュー", "http://minkara.carview.co.jp/"),
    PIXIV(4000L, "ピクシブ株式会社", "http://www.pixiv.net/"),

    /* 写真 */
    PHOTOZOU(5000L, "OFF Line株式会社", "http://photozou.jp/"),

    /* 音楽 */
    UTASUKI(6000L, "株式会社エクシング", "http://joysound.com/ex/utasuki/"),
    DAMTOMO(7000L, "第一興商", "http://www.clubdam.com/app/damtomo/top/Index.do"),

    /* 海外 */
    CYWORLD(10000L, "SK Communications", "http://www.cyworld.com/cymain/"),
    WECHAT(20000L, "Tencent", "http://www.wechat.com/"),
    ODNOKLASSNIKI(30000L, "Mail.ru", "http://www.odnoklassniki.com/"),
    GOOGLEPLUS(40000L, "Google Inc.", "http://plus.google.com"),
    FACEBOOK(50000L, "Facebook, Inc.", "https://www.facebook.com/"),
    FLICKR(60000L, "Yahoo!", "https://www.flickr.com"),
    LINKEDIN(70000L, "LinkedIn", "https://www.linkedin.com"),
    YOUTUBE(80000L, "Google Inc", "https://www.youtube.com/"),
    PINTEREST(90000L, "Pinterest, Inc.", "https://www.pinterest.com/"),
    SOUNDCLOUD(100000L, "SoundCloud Limited", "https://soundcloud.com/");

    private Long genre;

    private String company;

    private String url;

    private SnsConstant(Long genre, String company, String url) {
        this.genre = genre;
        this.company = company;
        this.url = url;
    }

    @Override
    public Long get() {
        // TODO Auto-generated method stub
        return genre;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return company;
    }

    public String getUrl() {
        return url;
    }

    /**
     * throw new UnsupportedOperationException
     * 
     * @throws UnsupportedOperationException
     */
    @Override
    @Deprecated
    public void set(Long genre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException();
    }

    @Override
    public Long getDefault() {
        // TODO Auto-generated method stub
        return null;
    }

}
