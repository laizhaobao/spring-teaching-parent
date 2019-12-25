package com.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

/**
 * @author cj
 * @date 2019/12/24
 */
@Data
@JsonIgnoreProperties({"specialID"})
public class NetEaseNews {


    /**
     * imgextra : [{"imgsrc":"http://cms-bucket.ws.126.net/2019/1223/f5549aa7j00q2yfmp0028c0009c005uc.jpg"},{"imgsrc":"http://cms-bucket.ws.126.net/2019/1223/4c08193fj00q2yfmp002ec0009c005uc.jpg"}]
     * liveInfo : null
     * docid : 00C90005|167067
     * source : SIPA
     * title : 疯狂球迷要锯断伊布雕像!鼻子已经没了
     * priority : 252
     * url : 00C90005|167067
     * skipURL : http://3g.163.com/touch/photoview.html?channelid=0005&setid=167067
     * commentCount : 703
     * imgsrc3gtype : 2
     * stitle : 00C90005|167067
     * digest :
     * skipType : photoset
     * photosetID : 0005|167067
     * imgsrc : http://cms-bucket.ws.126.net/2019/1223/6850b8d9j00q2yyee00mnc000s600e3c.jpg
     * ptime : 2019-12-23 15:32:52
     * modelmode : u
     */
    private List<ImgextraEntity> imgextra;
    private String liveInfo;
    private String docid;
    private String source;
    private String title;
    private int priority;
    private String url;
    private String skipURL;
    private int commentCount;
    private String imgsrc3gtype;
    private String stitle;
    private String digest;
    private String skipType;
    private String photosetID;
    private String imgsrc;
    private String ptime;
    private String modelmode;
    private Integer hasImg;

    public Integer getHasImg() {
        return hasImg;
    }

    public void setHasImg(Integer hasImg) {
        this.hasImg = hasImg;
    }

    public void setImgextra(List<ImgextraEntity> imgextra) {
        this.imgextra = imgextra;
    }

    public void setLiveInfo(String liveInfo) {
        this.liveInfo = liveInfo;
    }

    public void setDocid(String docid) {
        this.docid = docid;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setSkipURL(String skipURL) {
        this.skipURL = skipURL;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public void setImgsrc3gtype(String imgsrc3gtype) {
        this.imgsrc3gtype = imgsrc3gtype;
    }

    public void setStitle(String stitle) {
        this.stitle = stitle;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public void setSkipType(String skipType) {
        this.skipType = skipType;
    }

    public void setPhotosetID(String photosetID) {
        this.photosetID = photosetID;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

    public void setPtime(String ptime) {
        this.ptime = ptime;
    }

    public void setModelmode(String modelmode) {
        this.modelmode = modelmode;
    }

    public List<ImgextraEntity> getImgextra() {
        return imgextra;
    }

    public String getLiveInfo() {
        return liveInfo;
    }

    public String getDocid() {
        return docid;
    }

    public String getSource() {
        return source;
    }

    public String getTitle() {
        return title;
    }

    public int getPriority() {
        return priority;
    }

    public String getUrl() {
        return url;
    }

    public String getSkipURL() {
        return skipURL;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public String getImgsrc3gtype() {
        return imgsrc3gtype;
    }

    public String getStitle() {
        return stitle;
    }

    public String getDigest() {
        return digest;
    }

    public String getSkipType() {
        return skipType;
    }

    public String getPhotosetID() {
        return photosetID;
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public String getPtime() {
        return ptime;
    }

    public String getModelmode() {
        return modelmode;
    }


}
