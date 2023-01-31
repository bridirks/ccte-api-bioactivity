package gov.epa.ccte.api.bioactivity.dto.mapper;

import gov.epa.ccte.api.bioactivity.domain.ApiKey;
import gov.epa.ccte.api.bioactivity.dto.ApiKeyDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ApiKeyMapper {
    ApiKey toEntity(ApiKeyDto apiKeyDto);

    ApiKeyDto toDto(ApiKey apiKey);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    ApiKey partialUpdate(ApiKeyDto apiKeyDto, @MappingTarget ApiKey apiKey);
}