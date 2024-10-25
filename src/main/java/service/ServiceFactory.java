package service;

public class ServiceFactory {
    private static ServiceFactory instance;
    private ServiceFactory(){}

    public static ServiceFactory getInstance() {
        return instance==null?instance=new ServiceFactory():instance;
    }

//    public <T extends SuperService>T getServiceType(ServiceType type){
//        switch (type){
//            case CUSTOMER:return (T) new CustomerServiceImpl();
//            case ITEM:return (T) new ItemServiceImpl();
//        }
//        return null;
//    }

    //    <T extends SuperService>T
}