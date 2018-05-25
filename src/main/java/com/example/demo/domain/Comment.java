package com.example.demo.domain;

import java.math.BigDecimal;

public class Comment {
    private String id;

    private String pId;

    private Integer targetType;

    private String targetId;

    private String targetName;

    private BigDecimal score1;

    private BigDecimal score2;

    private BigDecimal score3;

    private BigDecimal score4;

    private BigDecimal score5;

    private BigDecimal scoreFinal;

    private Integer imgCount;

    private Integer replyCount;

    private Integer likeCount;

    private Integer unlikeCount;

    private Integer againstCount;

    private String againstState;

    private String ownerUserId;

    private String avatar;

    private String ownerUserLoginName;

    private String ownerUserNickName;

    private String targetUserId;

    private String targetUserNickName;

    private Integer stick;

    private Integer highlight;

    private Integer auditState;

    private String delState;

    private Long createTime;

    private String shardingId;

    private String residentialId;

    private String residentialName;

    private Long updateTime;

    private String commentTag;

    private String terminal;

    private Long againstTime;

    private String districtId;

    private String districtName;

    private String pinyin;

    private Long publicTime;

    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId == null ? null : pId.trim();
    }

    public Integer getTargetType() {
        return targetType;
    }

    public void setTargetType(Integer targetType) {
        this.targetType = targetType;
    }

    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId == null ? null : targetId.trim();
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName == null ? null : targetName.trim();
    }

    public BigDecimal getScore1() {
        return score1;
    }

    public void setScore1(BigDecimal score1) {
        this.score1 = score1;
    }

    public BigDecimal getScore2() {
        return score2;
    }

    public void setScore2(BigDecimal score2) {
        this.score2 = score2;
    }

    public BigDecimal getScore3() {
        return score3;
    }

    public void setScore3(BigDecimal score3) {
        this.score3 = score3;
    }

    public BigDecimal getScore4() {
        return score4;
    }

    public void setScore4(BigDecimal score4) {
        this.score4 = score4;
    }

    public BigDecimal getScore5() {
        return score5;
    }

    public void setScore5(BigDecimal score5) {
        this.score5 = score5;
    }

    public BigDecimal getScoreFinal() {
        return scoreFinal;
    }

    public void setScoreFinal(BigDecimal scoreFinal) {
        this.scoreFinal = scoreFinal;
    }

    public Integer getImgCount() {
        return imgCount;
    }

    public void setImgCount(Integer imgCount) {
        this.imgCount = imgCount;
    }

    public Integer getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Integer getUnlikeCount() {
        return unlikeCount;
    }

    public void setUnlikeCount(Integer unlikeCount) {
        this.unlikeCount = unlikeCount;
    }

    public Integer getAgainstCount() {
        return againstCount;
    }

    public void setAgainstCount(Integer againstCount) {
        this.againstCount = againstCount;
    }

    public String getAgainstState() {
        return againstState;
    }

    public void setAgainstState(String againstState) {
        this.againstState = againstState == null ? null : againstState.trim();
    }

    public String getOwnerUserId() {
        return ownerUserId;
    }

    public void setOwnerUserId(String ownerUserId) {
        this.ownerUserId = ownerUserId == null ? null : ownerUserId.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getOwnerUserLoginName() {
        return ownerUserLoginName;
    }

    public void setOwnerUserLoginName(String ownerUserLoginName) {
        this.ownerUserLoginName = ownerUserLoginName == null ? null : ownerUserLoginName.trim();
    }

    public String getOwnerUserNickName() {
        return ownerUserNickName;
    }

    public void setOwnerUserNickName(String ownerUserNickName) {
        this.ownerUserNickName = ownerUserNickName == null ? null : ownerUserNickName.trim();
    }

    public String getTargetUserId() {
        return targetUserId;
    }

    public void setTargetUserId(String targetUserId) {
        this.targetUserId = targetUserId == null ? null : targetUserId.trim();
    }

    public String getTargetUserNickName() {
        return targetUserNickName;
    }

    public void setTargetUserNickName(String targetUserNickName) {
        this.targetUserNickName = targetUserNickName == null ? null : targetUserNickName.trim();
    }

    public Integer getStick() {
        return stick;
    }

    public void setStick(Integer stick) {
        this.stick = stick;
    }

    public Integer getHighlight() {
        return highlight;
    }

    public void setHighlight(Integer highlight) {
        this.highlight = highlight;
    }

    public Integer getAuditState() {
        return auditState;
    }

    public void setAuditState(Integer auditState) {
        this.auditState = auditState;
    }

    public String getDelState() {
        return delState;
    }

    public void setDelState(String delState) {
        this.delState = delState == null ? null : delState.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getShardingId() {
        return shardingId;
    }

    public void setShardingId(String shardingId) {
        this.shardingId = shardingId == null ? null : shardingId.trim();
    }

    public String getResidentialId() {
        return residentialId;
    }

    public void setResidentialId(String residentialId) {
        this.residentialId = residentialId == null ? null : residentialId.trim();
    }

    public String getResidentialName() {
        return residentialName;
    }

    public void setResidentialName(String residentialName) {
        this.residentialName = residentialName == null ? null : residentialName.trim();
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getCommentTag() {
        return commentTag;
    }

    public void setCommentTag(String commentTag) {
        this.commentTag = commentTag == null ? null : commentTag.trim();
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal == null ? null : terminal.trim();
    }

    public Long getAgainstTime() {
        return againstTime;
    }

    public void setAgainstTime(Long againstTime) {
        this.againstTime = againstTime;
    }

    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId == null ? null : districtId.trim();
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName == null ? null : districtName.trim();
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin == null ? null : pinyin.trim();
    }

    public Long getPublicTime() {
        return publicTime;
    }

    public void setPublicTime(Long publicTime) {
        this.publicTime = publicTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}