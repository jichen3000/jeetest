package colin.lazyload;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.primefaces.model.LazyDataModel;

import colin.deletechild.DadEntity;
import colin.deletechild.DadService;



public class DadLazyList extends LazyDataModel<DadEntity> {
	private static final long serialVersionUID = 1L;

	private DadService dadService;

	public DadLazyList(DadService dadService) {
		this.dadService = dadService;
	} 

	public List<DadEntity> genList(int index, int count){
		List<DadEntity> result= new ArrayList<DadEntity>();
		for(int i=0; i<count; i++){
			result.add(new DadEntity(new Long(index*100+i), "colin"+i));
			
		}
		return result;
	}
	
	@Override
	public List<DadEntity> load(int startingAt, int maxPerPage, String sortField,
			boolean arg3, Map<String, String> arg4) {
//		List<DadEntity> newList = new ArrayList<DadEntity>(dadService.findRange(new int[]{startingAt, maxPerPage}));
		List<DadEntity> newList = genList(startingAt, maxPerPage);
		if (getRowCount() <= 0) {
//			setRowCount(dadService.count());
			setRowCount(20);
		}
		setPageSize(maxPerPage);
//		Object t = this.getRowData();
//		Object t1 = this.getWrappedData();
		System.out.println("list length:"+newList.size());
		return newList;
	}
}
