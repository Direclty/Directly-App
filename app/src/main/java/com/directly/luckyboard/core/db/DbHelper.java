package com.directly.luckyboard.core.db;

import com.directly.luckyboard.core.bean.superdata.HistoryData;

import java.util.List;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/7 16:29
 */

public interface DbHelper {
    /**
     * 增加历史数据
     *
     * @param data added string
     * @return List<HistoryData>
     */
    List<HistoryData> addHistoryData(String data);

    /**
     * Clear search history data
     */
    void clearHistoryData();

    /**
     * Load all history data
     *
     * @return List<HistoryData>
     */
    List<HistoryData> loadAllHistoryData();
}
