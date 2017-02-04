package com.vk.api.sdk.objects.updates;

import java.util.Set;

/**
 * @author Denis Kokorin
 */
public class RemoveDialogFlags implements Update {
    private final Integer peerId;
    private final Set<DialogFlag> flags;

    public RemoveDialogFlags(Integer peerId, Set<DialogFlag> flags) {
        this.peerId = peerId;
        this.flags = flags;
    }

    public Integer getPeerId() {
        return peerId;
    }

    public Set<DialogFlag> getFlags() {
        return flags;
    }
}
