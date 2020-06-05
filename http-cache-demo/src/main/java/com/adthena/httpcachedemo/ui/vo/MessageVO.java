package com.adthena.httpcachedemo.ui.vo;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.Objects;

@JsonDeserialize(builder = MessageVO.MessageVOBuilder.class)
public final class MessageVO {

    private final String message;

    MessageVO(String message) {
        this.message = message;
    }

    public static MessageVOBuilder builder() {return new MessageVOBuilder();}

    public String getMessage() {return this.message;}

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MessageVO)) {
            return false;
        }
        final MessageVO other = (MessageVO) o;
        final Object this$message = this.getMessage();
        final Object other$message = other.getMessage();
        return Objects.equals(this$message, other$message);
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $message = this.getMessage();
        result = result * PRIME + ($message == null ? 43 : $message.hashCode());
        return result;
    }

    public String toString() {return "MessageVO(message=" + this.getMessage() + ")";}

    @JsonPOJOBuilder(withPrefix = "")
    public static class MessageVOBuilder {

        private String message;

        MessageVOBuilder() {}

        public MessageVOBuilder message(String message) {
            this.message = message;
            return this;
        }

        public MessageVO build() {
            return new MessageVO(message);
        }

        public String toString() {return "MessageVO.MessageVOBuilder(message=" + this.message + ")";}
    }
}
