package com.reprezen.kaizen.oasparser.ovl3;

import com.fasterxml.jackson.databind.JsonNode;
import com.reprezen.kaizen.oasparser.jsonoverlay.JsonOverlay;
import com.reprezen.kaizen.oasparser.jsonoverlay.JsonOverlayFactory;
import com.reprezen.kaizen.oasparser.jsonoverlay.coll.MapOverlay;
import com.reprezen.kaizen.oasparser.jsonoverlay.coll.ValMapOverlay;
import com.reprezen.kaizen.oasparser.jsonoverlay.std.AnyObjectOverlay;
import com.reprezen.kaizen.oasparser.jsonoverlay.std.StringOverlay;
import com.reprezen.kaizen.oasparser.model3.Header;
import com.reprezen.kaizen.oasparser.model3.Link;
import com.reprezen.kaizen.oasparser.model3.MediaType;
import com.reprezen.kaizen.oasparser.model3.Response;
import com.reprezen.kaizen.oasparser.ovl3.HeaderImpl;
import com.reprezen.kaizen.oasparser.ovl3.LinkImpl;
import com.reprezen.kaizen.oasparser.ovl3.MediaTypeImpl;
import com.reprezen.kaizen.oasparser.ovl3.OpenApiObjectImpl;
import java.util.Map;
import javax.annotation.Generated;

public class ResponseImpl extends OpenApiObjectImpl implements Response {

    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public ResponseImpl(String key, JsonNode json, JsonOverlay<?> parent) {
        super(key, json, parent);
    }

    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public ResponseImpl(String key, JsonOverlay<?> parent) {
        super(key, parent);
    }

    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    private StringOverlay description = registerField("description", "description", null, new StringOverlay("description", this));

    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    private MapOverlay<HeaderImpl> headers = registerField("headers", "headers", null, new MapOverlay<HeaderImpl>("headers", this, HeaderImpl.factory, null));

    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    private MapOverlay<MediaTypeImpl> contentMediaTypes = registerField("content", "contentMediaTypes", null, new MapOverlay<MediaTypeImpl>("content", this, MediaTypeImpl.factory, null));

    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    private MapOverlay<LinkImpl> links = registerField("links", "links", null, new MapOverlay<LinkImpl>("links", this, LinkImpl.factory, null));

    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    private ValMapOverlay<Object,AnyObjectOverlay> extensions = registerField("", "extensions", "x-.+", new ValMapOverlay<Object, AnyObjectOverlay>("", this, AnyObjectOverlay.factory, "x-.+"));

    // Description
    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public String getDescription() {
        return description.get();
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public void setDescription(String description) {
        this.description.set(description);
    }

    // Header
    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public Map<String, ? extends Header> getHeaders() {
        return headers.get();
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public boolean hasHeader(String name) {
        return headers.containsKey(name);
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public Header getHeader(String name) {
        return headers.get(name);
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public void setHeaders(Map<String, ? extends Header> headers) {
        @SuppressWarnings("unchecked")
            Map<String,HeaderImpl> implHeaders = (Map<String, HeaderImpl>) headers;
            this.headers.set(implHeaders);
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public void setHeader(String name, Header header) {
        headers.set(name, (HeaderImpl) header);
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public void removeHeader(String name) {
        headers.remove(name);
    }

    // ContentMediaType
    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public Map<String, ? extends MediaType> getContentMediaTypes() {
        return contentMediaTypes.get();
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public boolean hasContentMediaType(String name) {
        return contentMediaTypes.containsKey(name);
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public MediaType getContentMediaType(String name) {
        return contentMediaTypes.get(name);
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public void setContentMediaTypes(Map<String, ? extends MediaType> contentMediaTypes) {
        @SuppressWarnings("unchecked")
            Map<String,MediaTypeImpl> implContentMediaTypes = (Map<String, MediaTypeImpl>) contentMediaTypes;
            this.contentMediaTypes.set(implContentMediaTypes);
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public void setContentMediaType(String name, MediaType contentMediaType) {
        contentMediaTypes.set(name, (MediaTypeImpl) contentMediaType);
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public void removeContentMediaType(String name) {
        contentMediaTypes.remove(name);
    }

    // Link
    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public Map<String, ? extends Link> getLinks() {
        return links.get();
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public boolean hasLink(String name) {
        return links.containsKey(name);
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public Link getLink(String name) {
        return links.get(name);
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public void setLinks(Map<String, ? extends Link> links) {
        @SuppressWarnings("unchecked")
            Map<String,LinkImpl> implLinks = (Map<String, LinkImpl>) links;
            this.links.set(implLinks);
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public void setLink(String name, Link link) {
        links.set(name, (LinkImpl) link);
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public void removeLink(String name) {
        links.remove(name);
    }

    // Extension
    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public Map<String, Object> getExtensions() {
        return extensions.get();
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public boolean hasExtension(String name) {
        return extensions.containsKey(name);
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public Object getExtension(String name) {
        return extensions.get(name);
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public void setExtensions(Map<String, Object> extensions) {
        this.extensions.set(extensions);
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public void setExtension(String name, Object extension) {
        extensions.set(name, extension);
    }

    @Override
    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public void removeExtension(String name) {
        extensions.remove(name);
    }

    @Generated("com.reprezen.kaizen.oasparser.jsonoverlay.gen.CodeGenerator")
    public static JsonOverlayFactory<ResponseImpl> factory = new JsonOverlayFactory<ResponseImpl>() {
    @Override
    public ResponseImpl create(String key, JsonNode json, JsonOverlay<?> parent) {
        return isEmptyRecursive(parent, ResponseImpl.class) ? null : new ResponseImpl(key, json, parent);
    }
};

}
