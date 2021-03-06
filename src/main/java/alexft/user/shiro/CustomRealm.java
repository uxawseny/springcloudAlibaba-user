//package alexft.user.shiro;
//
//import alexft.user.entity.User;
//import alexft.user.service.IUserService;
//import org.apache.shiro.authc.AuthenticationException;
//import org.apache.shiro.authc.AuthenticationInfo;
//import org.apache.shiro.authc.AuthenticationToken;
//import org.apache.shiro.authc.SimpleAuthenticationInfo;
//import org.apache.shiro.authz.AuthorizationInfo;
//import org.apache.shiro.authz.SimpleAuthorizationInfo;
//import org.apache.shiro.realm.AuthorizingRealm;
//import org.apache.shiro.subject.PrincipalCollection;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.util.ObjectUtils;
//
//public class CustomRealm extends AuthorizingRealm {
//
//    @Autowired
//    IUserService userService;
//
//    @Override
//    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//        //获取登录用户名
//        String name = (String) principalCollection.getPrimaryPrincipal();
//        User userParam = new User();
//        userParam.setUsername(name);
//        //todo 查询用户名称
//        User user = userService.getUserByName(userParam);
//        //添加角色和权限
//        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
//        return simpleAuthorizationInfo;
//    }
//
//    @Override
//    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
//        if (ObjectUtils.isEmpty(authenticationToken.getPrincipal())) {
//            return null;
//        }
//        //获取用户信息
//        String name = authenticationToken.getPrincipal().toString();
//        User userParam = new User();
//        userParam.setUsername(name);
//        User user = userService.getUserByName(userParam);
//        if (user == null) {
//            //这里返回后会报出对应异常
//            return null;
//        } else {
//            //这里验证authenticationToken和simpleAuthenticationInfo的信息
//            SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(name, user.getPwd(), getName());
//            return simpleAuthenticationInfo;
//        }
//    }
//}
