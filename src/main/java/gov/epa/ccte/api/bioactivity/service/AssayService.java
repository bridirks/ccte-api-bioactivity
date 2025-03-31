package gov.epa.ccte.api.bioactivity.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import gov.epa.ccte.api.bioactivity.projection.assay.CcdAssayList;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class AssayService {
	
	public List<Map<String, Object>> wrapCcdAssayList(List<CcdAssayList> assayList) {
	    List<Map<String, Object>> formattedAssays = new ArrayList<>();

	    for (CcdAssayList assay : assayList) {
	        Map<String, Object> formattedAssay = new LinkedHashMap<>();

	        formattedAssay.put("vendorKey", assay.getVendorKey());
	        formattedAssay.put("vendorName", assay.getVendorName());
	        formattedAssay.put("assayName", assay.getAssayName());
	        formattedAssay.put("aeid", assay.getAeid());
	        formattedAssay.put("assayComponentName", assay.getAssayComponentName());
	        formattedAssay.put("assayComponentEndpointName", assay.getAssayComponentEndpointName());
	        formattedAssay.put("assayComponentEndpointDesc", assay.getAssayComponentEndpointDesc());
	        formattedAssay.put("ccdAssayDetail", assay.getCcdAssayDetail());

	        // geneArray
	        Map<String, Object> geneMap = new LinkedHashMap<>();
	        geneMap.put("entrezGeneId", assay.getEntrezGeneId());
	        geneMap.put("geneName", assay.getGeneName());
	        geneMap.put("geneSymbol", assay.getGeneSymbol());
	        geneMap.put("commonName", assay.getCommonName());
	        geneMap.put("taxonName", assay.getTaxonName());
	        formattedAssay.put("geneArray", List.of(geneMap));

	        // singleConc
	        Map<String, Object> singleConcMap = new LinkedHashMap<>();
	        singleConcMap.put("singleConcChemicalCountActive", assay.getSingleConcChemicalCountActive());
	        singleConcMap.put("singleConcChemicalCountTotal", assay.getSingleConcChemicalCountTotal());
	        formattedAssay.put("singleConc", List.of(singleConcMap));

	        // multiConc
	        Map<String, Object> multiConcMap = new LinkedHashMap<>();
	        multiConcMap.put("multiConcChemicalCountActive", assay.getMultiConcChemicalCountActive());
	        multiConcMap.put("multiConcChemicalCountTotal", assay.getMultiConcChemicalCountTotal());
	        formattedAssay.put("multiConc", List.of(multiConcMap));

	        formattedAssays.add(formattedAssay);
	    }

	    return formattedAssays;
	}

}
