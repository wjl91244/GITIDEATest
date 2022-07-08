package com.itheima.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.reggie.bean.AddressBook;
import com.itheima.reggie.mapper.AddressMapper;
import com.itheima.reggie.service.AddressBookService;
import org.springframework.stereotype.Service;

/**
 * @projectName: reggie_take_out
 * @package: com.itheima.reggie.service.impl
 * @className: AddressBookServiceImpl
 * @author: WJL
 * @description: TODO
 * @date: 2022/7/7 19:22
 * @version: 1.0
 */
@Service
public class AddressBookServiceImpl  extends ServiceImpl<AddressMapper, AddressBook> implements AddressBookService  {
}
