package cn.mldn.linqiangspring.ioc.service.impl;

import cn.mldn.linqiangspring.ioc.service.IMessage;

public class MessageImpl implements IMessage {
	@Override
	public String echo(String msg) {
		return "【ECHO】" + msg;
	}
}
