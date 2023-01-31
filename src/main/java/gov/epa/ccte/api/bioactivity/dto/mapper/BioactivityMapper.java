package gov.epa.ccte.api.bioactivity.dto.mapper;

import gov.epa.ccte.api.bioactivity.domain.Bioactivity;
import gov.epa.ccte.api.bioactivity.dto.BioactivityDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface BioactivityMapper {
    Bioactivity toEntity(BioactivityDto bioactivityDto);

    BioactivityDto toDto(Bioactivity bioactivity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Bioactivity partialUpdate(BioactivityDto bioactivityDto, @MappingTarget Bioactivity bioactivity);
}