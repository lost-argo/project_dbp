package org.denguetrace.news.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.denguetrace.district.domain.District;
import org.w3c.dom.Text;

import java.security.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class News {
    @Id
    Long newsId;
    String title;
    String source;
    String url;
    Timestamp publicationDate;
    District districtId;
    Double relevanceScore;
    Text summary;
}
