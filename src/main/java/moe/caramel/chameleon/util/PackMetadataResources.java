package moe.caramel.chameleon.util;

import java.io.InputStream;

public class PackMetadataResources implements net.minecraft.server.packs.PackMetadataResources{
	
	@Override
	public net.minecraft.server.packs.PackLocationInfo location(){
		return null;
	}
	
	@Override
	public net.minecraft.server.packs.resources.@org.jspecify.annotations.Nullable IoSupplier<java.io.InputStream> getRootResource(String... path){
		return null;
	}
	
	@Override
	public @org.jspecify.annotations.Nullable <T> T getMetadataSection(net.minecraft.server.packs.metadata.MetadataSectionType<T> metadataSerializer) throws java.io.IOException{
		return null;
	}
	
	@Override
	public void close(){
	
	}
}
