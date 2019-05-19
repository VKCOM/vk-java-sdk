#!/usr/bin/env bash
#if [ "$TRAVIS_BRANCH" = 'master' -a "$TRAVIS_PULL_REQUEST" = "false" ]; then
  openssl aes-256-cbc -K $encrypted_5c22135b7a45_key -iv $encrypted_5c22135b7a45_iv -in travis.gpg.enc -out travis.gpg -d
  gradle uploadArchives releaseNexusRepositories -PossrhUsername=${SONATYPE_USERNAME} -PossrhPassword=${SONATYPE_PASSWORD} -Psigning.keyId=${GPG_KEY_ID} -Psigning.password=${GPG_KEY_PASSPHRASE} -Psigning.secretKeyRingFile=~/travis/VKCOM/vk-java-sdk/travis.gpg
#fi

