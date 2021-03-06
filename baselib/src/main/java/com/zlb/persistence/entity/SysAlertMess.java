package com.zlb.persistence.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 *
 *
 * Created by zenglb on 2017/3/27.
 */
@Entity
public class SysAlertMess {
    @Id(autoincrement = false)
    private Long id;             // int --> long    要不要id序列化

    private String title;
    private String actionType;
    private String message;         // 消息详情
    private String detailUrl;       // 消息详情URL,不喜欢actionId 的命名方式



    @Generated(hash = 389339895)
    public SysAlertMess(Long id, String title, String actionType, String message,
            String detailUrl) {
        this.id = id;
        this.title = title;
        this.actionType = actionType;
        this.message = message;
        this.detailUrl = detailUrl;
    }

    @Generated(hash = 536878860)
    public SysAlertMess() {
    }

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }
}
