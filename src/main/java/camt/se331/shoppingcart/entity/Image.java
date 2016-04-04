package camt.se331.shoppingcart.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by patima on 4/5/2016.
 */
@Entity
public class Image {
     @Id
     @GeneratedValue
     private Long id;

             String fileName;
     @Lob
     byte[] content;
     String contentType;

             @Temporal(TemporalType.TIME)
             Date created;

    public Long getId() {
        return id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getContentType() {

        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
}