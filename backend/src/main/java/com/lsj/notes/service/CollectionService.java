package com.lsj.notes.service;
import com.lsj.notes.model.base.ApiResponse;
import com.lsj.notes.model.base.EmptyVO;
import com.lsj.notes.model.dto.collection.CollectionQueryParams;
import com.lsj.notes.model.dto.collection.CreateCollectionBody;
import com.lsj.notes.model.dto.collection.UpdateCollectionBody;
import com.lsj.notes.model.vo.collection.CollectionVO;
import com.lsj.notes.model.vo.collection.CreateCollectionVO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface CollectionService {
    /**
     * 获取收藏夹列表
     *
     * @param queryParams 收藏夹查询参数
     * @return 收藏夹列表
     */
    ApiResponse<List<CollectionVO>> getCollections(CollectionQueryParams queryParams);

    /**
     * 创建收藏夹
     *
     * @param requestBody 收藏夹信息
     * @return 收藏夹信息，包含收藏夹 Id
     */
    ApiResponse<CreateCollectionVO> createCollection(CreateCollectionBody requestBody);

    /**
     * 删除收藏夹
     * @param collectionId 收藏夹 Id
     * @return 占位
     */
    ApiResponse<EmptyVO> deleteCollection(Integer collectionId);

    /**
     * 批量收藏或者取消收藏笔记
     * @param requestBody 包含收藏夹 Id 和笔记 Id 的对象
     *                    action 为 create 时为收藏，为 delete 时为取消收藏
     * @return 占位
     */
    ApiResponse<EmptyVO> batchModifyCollection(UpdateCollectionBody requestBody);
}
