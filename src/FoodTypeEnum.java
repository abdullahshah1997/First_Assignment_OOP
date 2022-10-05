public enum FoodTypeEnum {
    ENRICHEDWATER("mineralvatten"),
    TAPWATER("kranvatten"),
    PROTEINSHAKE("proteindryck");

    public final String toLowerCase;
    FoodTypeEnum(String toLowerCase){
        this.toLowerCase = toLowerCase;

    }

}
