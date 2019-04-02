package group.agv01.authority;

public class BaseInterceptor {

//	    /**
//	     * 权限列表查询
//	     * @param permissionDomainRepository
//	     * @param url
//	     * @return
//	     */
//	    public boolean isHavePermiss(PermissionDomainRepository permissionDomainRepository, UserInfo userInfo, String url){
//	        boolean falg = false;
//
//	        //获取用户权限
//	        Set<PermissionInfo> permissionInfos = permissionDomainRepository.findPermissionByUid(userInfo.getId());
//
//	        //对比查询权限
//	        Iterator<PermissionInfo> iterator = permissionInfos.iterator();
//
//	        while(iterator.hasNext()){
//	            PermissionInfo permissionInfo = iterator.next();
//	            if(permissionInfo.getpUrl().equals(url)){
//	                falg = true;
//	            }
//	        }
//	        return falg;
//	    }
	
}
