//상품 데이터 정보 전달하는 클래스

package com.shop.dto;

import com.shop.constant.ItemSellStatus;
//import com.shop.entity.CategoryRef;
import com.shop.entity.Item;
//import com.shop.mapstruct.ItemFormMapStruct;
//import com.shop.mapstruct.ItemFormMapStructImpl;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ItemFormDto {

    private Long id;

    private Long cate_codeRef;

    private String lprice;

    @NotBlank(message = "상품명은 필수 입력 값입니다.")
    private String itemNm;

    @NotNull(message = "가격은 필수 입력 값입니다")
    private Integer price;

    @NotBlank(message = "이름은 필수 입력 값입니다.")
    private String itemDetail;

    @NotNull(message = "재고는 필수 입력 값입니다.")
    private Integer stockNumber;

    private ItemSellStatus itemSellStatus;

    private List<ItemImgDto> itemImgDtoList = new ArrayList<>();

    private  List<Long> itemImgIds = new ArrayList<>();

    private  static ModelMapper modelMapper = new ModelMapper();
//    private static ItemFormMapStruct itemFormMapStruct = new ItemFormMapStructImpl();

    public Item createItem(){
        return modelMapper.map(this, Item.class);
    }
//    public Item createItem(){
//        return itemFormMapStruct.toEntity(this);
//    }

    public static ItemFormDto of(Item item){
        return modelMapper.map(item,ItemFormDto.class);
    }
//    public static ItemFormDto of(Item item){
//        return itemFormMapStruct.toDto(item);
//    }
}