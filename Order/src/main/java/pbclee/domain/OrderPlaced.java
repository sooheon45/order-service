package pbclee.domain;

import java.util.*;
import lombok.*;
import pbclee.domain.*;
import pbclee.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;

    public OrderPlaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
