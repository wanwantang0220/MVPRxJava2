package com.yunlin.xihai.user.elder.app;

import java.io.File;

public interface AppConstants {

    // SharedPreferences名称
    String SHARED_PREFERENCES_NAME = "XiHai_Staff_APP";

    String API_VERSION = "1.1";

    String PLATFORM = "android";


    // 成功Code
    int CODE_SUCCESS = 0;

    // 过期Code
    int CODE_EXPIRE = 40019;
    // 版本过低Code
    int CODE_UPDATE = 40026;



    // Toast类别 ERROR
    int TYPE_TOAST_ERROR = 0;
    // Toast类别 SUCCESS
    int TYPE_TOAST_SUCCESS = 1;
    // Toast类别 INFO
    int TYPE_TOAST_INFO = 2;
    // Toast类别 WARNING
    int TYPE_TOAST_WARNING = 3;
    // Toast类别 NORMAL
    int TYPE_TOAST_NORMAL = 4;


    // 空字符串
    String EMPTY_STRING = "";

    // 超时
    long HTTP_TIME_OUT = 10;

    // 硬盘缓存最大值
    int DISK_MAX_SIZE = 50 * 1024 * 1024;


    // 应用文件夹名称
    String PATH_NAME = "XiHai" + File.separator + "User";
    // 缓存图片文件夹名称
    String IMAGE_CACHE = "imageCache";
    // 保存图片文件夹名称
    String IMAGE_SAVE = "imageSave";
    // 保存应用文件夹名称
    String APK_SAVE = "apkSave";
    // 保存错误文件夹名称
    String CRASH_SAVE = "crashSave";
    // 保存错误文件夹名称
    String SONIC_CACHE = "sonicCache";

    // 访问文件权限名称
    String PROVIDER = ".provider";

    // 注册验证码倒计时Key
    String TIME_TYPE_REGISTER = "register";
    // 忘记密码验证码倒计时Key
    String TIME_TYPE_FORGET = "forget";

    // 验证码类别 注册
    String TYPE_REGISTER = "1";
    // 验证码类别 忘记密码
    String TYPE_FORGET_PASSWORD = "2";

    // 验证码时间
    int CODE_TIME = 60;

    // 头像宽
    int HEAD_OUTPUT_X = 500;
    // 头像高
    int HEAD_OUTPUT_Y = 500;

    // 反馈宽
    int FEEDBACK_OUTPUT_X = 720;
    // 反馈高
    int FEEDBACK_OUTPUT_Y = 1280;

    // APK名称
    String APK_NAME = "XiHai_User.apk";

    // 资讯时间格式
    String ARTICE_FORMAT = "yyyy-MM-dd";
    // 订单时间格式
    String ORDER_FORMAT = "yyyy-MM-dd HH:mm:ss";
    // 崩溃文件时间格式
    String CRASH_FORMAT = "yyyy-MM-dd-HH-mm-ss";
    // 服务时间格式
    String SERVICE_FORMAT = "yyyy-MM-dd HH:mm";

    // 定位经度
    String SAVE_LNG = "lng";
    // 定位纬度
    String SAVE_LAT = "lat";

    // 通知id
    int NOTIFICATION_FLAG = 1;

    // 用户信息token
    String TOKEN = "token";
    // 用户信息mobile
    String MOBILE = "mobile";
    // 用户信息userId
    String USER_ID = "userId";
    // 用户信息userName
    String USER_NAME = "userName";
    // 用户信息identity
    String IDENTITY = "identity";
    // 用户信息cityName
    String CITY_NAME = "cityName";
    // 用户信息cityCode
    String CITY_CODE = "cityCode";
    // 用户信息communityName
    String COMMUNITY_NAME = "communityName";
    // 用户信息communityCode
    String COMMUNITY_CODE = "communityCode";
    // 用户信息currentCommunityName
    String CURRENT_COMMUNITY_NAME = "currentCommunityName";
    // 用户信息currentCommunityCode
    String CURRENT_COMMUNITY_CODE = "currentCommunityCode";

    // 空白地址key
    String ABOUT_BLANK = "about:blank";

    // 每页数量
    int PAGE_SIZE = 10;

    // 消息状态 未读
    int MESSAGE_TYPE_UNREAD = 0;
    // 消息状态 已读
    int MESSAGE_TYPE_READ = 1;

    // 推送消息标题key
    String MSG_TITLE = "title";

    // 推送消息内容key
    String MSG_CONTENT = "content";

    // HomeFragment TAG
    String FRAGMENT_HOME_TAG = "home";

    // ServiceFragment TAG
    String FRAGMENT_SERVICE_TAG = "service";

    // MeFragment TAG
    String FRAGMENT_ME_TAG = "me";

    // UTF-8
    String CHARSET_UTF_8 = "UTF-8";

    // 首页幻灯片滚动时间
    long BANNER_TIME = 5000;

    // 幻灯片类型 资讯
    int BANNER_TYPE_ARTICLE = 1;
    // 幻灯片类型 活动
    int BANNER_TYPE_ACTIVITY = 2;

    // 用户类别 业主
    String USER_TYPE_RESIDENT = "1";
    // 用户类别 虚拟养老院
    String USER_TYPE_AGED = "2";

    // 服务开始时间 4天
    long SERVICE_START_TIME = 4 * 24 * 60 * 60 * 1000L;
    // 服务结束时间 6天
    long SERVICE_END_TIME = 6 * 24 * 60 * 60 * 1000L;
    // 服务检测时间 3天
    long SERVICE_CHECK_TIME = 3 * 24 * 60 * 60 * 1000L;
    // 订单支付超时时间
    long PAY_TIME = 15 * 60 * 1000L;

    // 是否需要刷新请求Code
    int REQUEST_REFRESH = 100;

    // 订单查询类型 全部
    String ORDER_SEARCH_TYPE_ALL = "";
    // 订单类型 待付款
    String ORDER_SEARCH_TYPE_UNPAID = "-1";
    // 订单类型 进行中
    String ORDER_SEARCH_TYPE_DOING = "-2";
    // 订单类型 已完成
    String ORDER_SEARCH_TYPE_COMPLETE = "-3";

    // 支付类型 支付宝
    int PAY_TYPE_ALIPAY = 1;
    // 支付类型 微信
    int PAY_TYPE_WXPAY = 2;
    // 支付类型 一卡通
    int PAY_TYPE_CARD = 3;
    // 支付类型 现金
    int PAY_TYPE_CASH = 4;

    // 订单类型 普通订单
    int ORDER_TYPE_COMMON = 1;
    // 订单类型 定金尾款订单
    int ORDER_TYPE_EARNEST = 2;
    // 订单类型 后台下单
    int ORDER_TYPE_SERVER = 4;

    // 订单状态 已下单待付款
    int ORDER_STATE_UNPAID = 1;
    // 订单状态 已付款待派单
    int ORDER_STATE_PAY = 2;
    // 订单状态 已退款（2-4都可以，服务开始30分钟前可以退款）
    int ORDER_STATE_REFUND = 3;
    // 订单状态 已派单
    int ORDER_STATE_DISTRIBUTION = 4;
    // 订单状态 签到，服务进行中
    int ORDER_STATE_SIGN = 5;
    // 订单状态 服务完成，待评价
    int ORDER_STATE_EVALUATE = 6;
    // 订单状态 已评价
    int ORDER_STATE_COMPLETE = 7;
    // 订单状态 已取消订单（下单15分钟未付款后订单变成已取消）
    int ORDER_STATE_CANCEL = 8;

    // 订单状态 定金已下单待付款
    int ORDER_EARNEST_STATE_UNPAID = 11;
    // 订单状态 已交定金待派单
    int ORDER_EARNEST_STATE_PAY = 1;
    // 订单状态 定金已退款
    int ORDER_EARNEST_STATE_REFUND = 12;
    // 订单状态 定金已取消
    int ORDER_EARNEST_STATE_CANCEL = 13;
    // 订单状态 已派单
    int ORDER_EARNEST_STATE_DISTRIBUTION = 2;
    // 订单状态 签到，服务进行中
    int ORDER_EARNEST_STATE_SIGN = 3;
    // 订单状态 已协商价格，待付款
    int ORDER_EARNEST_STATE_CONSULT_UNPAID = 4;
    // 订单状态 已付款
    int ORDER_EARNEST_STATE_CONSULT_PAY = 5;
    // 订单状态 服务完成，待评价
    int ORDER_EARNEST_STATE_EVALUATE = 6;
    // 订单状态 已评价
    int ORDER_EARNEST_STATE_COMPLETE = 7;
    // 订单状态 已取消订单（下单15分钟未付款后订单变成已取消）
    int ORDER_EARNEST_STATE_CONSULT_CANCEL = 8;

    // 订单操作 取消订单
    int ORDER_OPERATION_TYPE_CANCEL = 0;
    // 订单操作 订单退款
    int ORDER_OPERATION_TYPE_REFUND = 1;

    // 与户主关系 户主
    String RELATION_TYPE_MASTER = "1";
    // 与户主关系 住户
    String RELATION_TYPE_HOLD = "2";
    // 与户主关系 租户
    String RELATION_TYPE_TENANT = "3";

    // 性别类别 男
    String SEX_TYPE_MALE = "1";
    // 性别类别 女
    String SEX_TYPE_FEMALE = "2";

    // webview 标题
    String PARAM_TITLE = "param_title";
    // webview Url
    String PARAM_URL = "param_url";
    // webview 模式
    String PARAM_MODE = "param_mode";

    // 不使用Sonic
    int MODE_DEFAULT = 0;
    // 使用Sonic
    int MODE_SONIC = 1;

    // 地区类别 省
    String CITY_TYPE_PROVINCE = "1";
    // 地区类别 市
    String CITY_TYPE_CITY = "2";
    // 地区类别 区
    String CITY_TYPE_AREA = "3";
    // 地区类别 街道
    String CITY_TYPE_STREET = "4";
    // 地区类别 小区
    String CITY_TYPE_COMMUNITY = "5";

    // 地址类型 家庭
    String ADDR_TYPE_HOME = "1";
    // 地址类型 地址
    String ADDR_TYPE_ADDR = "2";

    // 活动状态 未开始
    int ACTIVITY_STATE_UNSTART = 0;
    // 活动状态 已满员
    int ACTIVITY_STATE_FULL = 1;
    // 活动状态 已截止
    int ACTIVITY_STATE_SIGN_END = 2;
    // 活动状态 已结束
    int ACTIVITY_STATE_END = 3;
    // 活动状态 已开始
    int ACTIVITY_STATE_START = 4;

    // 活动订单状态 已下单，免付款
    int ACTIVITY_ORDER_STATE_FREE = 0;
    // 活动状态 已下单，待付款
    int ACTIVITY_ORDER_STATE_UNPAY = 1;
    // 活动状态 已付款
    int ACTIVITY_ORDER_STATE_PAY = 2;
    // 活动状态 申请退款
    int ACTIVITY_ORDER_STATE_REFUND_APPLY = 3;
    // 活动状态 同意退款，退款中
    int ACTIVITY_ORDER_STATE_REFUNDING = 4;
    // 活动状态 退款失败
    int ACTIVITY_ORDER_STATE_REFUND_FAIL = 5;
    // 活动状态 退款成功
    int ACTIVITY_ORDER_STATE_REFUND_SUCCESS = 6;
    // 活动状态 拒绝退款
    int ACTIVITY_ORDER_STATE_REFUND_REFUSE = 7;
    // 活动状态 已取消
    int ACTIVITY_ORDER_STATE_CANCEL = 8;

    // 活动订单操作 取消报名
    int ACTIVITY_ORDER_OPERATION_TYPE_CANCEL = 0;

    // 用户端
    String PLATFORM_TYPE = "2";

    // 服务区域类别 区域
    String SERVICE_AREA_TYPE_AREA = "1";

//    // 客户端签名类型
//    String SIGN_TYPE = "Sign=WXPay";

    // 微信appId
    String WEIXIN_APP_ID = "wx956352b53af61ea6";

    // 小米appId
    String XIAOMI_APP_ID = "2882303761517955109";
    // 小米appKey
    String XIAOMI_APP_KEY = "5961795565109";

}
