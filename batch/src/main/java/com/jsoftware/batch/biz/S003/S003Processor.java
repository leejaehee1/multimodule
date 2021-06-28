package com.jsoftware.batch.biz.S003;

import com.jsoftware.batch.common.vo.DataItem;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;


@Slf4j
public class S003Processor implements ItemProcessor<DataItem, DataItem> {

    @Override
    public DataItem process(DataItem item) throws Exception {
        log.info("Processor");
        return item;
    }
}
