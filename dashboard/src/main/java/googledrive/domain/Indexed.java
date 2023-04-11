package googledrive.domain;

import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class Indexed extends AbstractEvent {

    private Long id;
    private List<String> keyword;
    private Long fileid;
    private String fileType;
    private String userid;
}
