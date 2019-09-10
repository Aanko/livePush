package cc.slogc.administrator.livepush.lvb.liveroom.ui;


import cc.slogc.administrator.livepush.lvb.liveroom.MLVBLiveRoom;

/**
 * Created by dennyfeng on 2017/11/22.
 */

public interface LiveRoomActivityInterface {
    MLVBLiveRoom getLiveRoom();
    String   getSelfUserID();
    String   getSelfUserName();
    void     showGlobalLog(boolean enable);
    void     printGlobalLog(String format, Object... args);
    void     setTitle(String s);
}
