package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Indexed extends AbstractEvent {

    private Long id;
    private Object keyword;
    private Long fileid;
    private String fileType;
    private String userid;
}
