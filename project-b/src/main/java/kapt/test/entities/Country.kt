package kapt.test.entities

import javax.persistence.*
import java.sql.Timestamp

@Entity
@Table
class Country {
    @Id
    var code: String? = null
    @Basic
    var zipFormat: String? = null
    @Basic
    @Column(nullable = false)
    var timestamp: Timestamp? = null
}
