package cn.panyunyi.healthylife.app.main.biz.local.model;

/*
 *create by panyunyi on2018/4/19
 */

public class BeatEntity {
    public String beats;
    public String currentDateDetail;
    public String timeCount;
    public int userId;

    public String getBeats() {
        return beats;
    }

    public void setBeats(String beats) {
        this.beats = beats;
    }

    public String getCurrentDate() {
        return currentDateDetail;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDateDetail = currentDate;
    }

    public String getTimeCount() {
        return timeCount;
    }

    public void setTimeCount(String timeCount) {
        this.timeCount = timeCount;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
