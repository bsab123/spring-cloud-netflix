
package org.caps.provider.repository;

import org.caps.provider.vo.SearchUserInfo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;


public interface UserRepository extends ElasticsearchRepository<SearchUserInfo, String> {
    List<SearchUserInfo> findByNameIsLike(String name);
}
