package com.github.kisaragieffective.coreprotectreloaded.common

import org.bukkit.Achievement
import org.bukkit.Bukkit
import org.bukkit.Effect
import org.bukkit.EntityEffect
import org.bukkit.GameMode
import org.bukkit.Instrument
import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.Note
import org.bukkit.Particle
import org.bukkit.Server
import org.bukkit.Sound
import org.bukkit.SoundCategory
import org.bukkit.Statistic
import org.bukkit.WeatherType
import org.bukkit.World
import org.bukkit.advancement.Advancement
import org.bukkit.advancement.AdvancementProgress
import org.bukkit.attribute.Attribute
import org.bukkit.attribute.AttributeInstance
import org.bukkit.block.Block
import org.bukkit.block.PistonMoveReaction
import org.bukkit.conversations.Conversation
import org.bukkit.conversations.ConversationAbandonedEvent
import org.bukkit.entity.Entity
import org.bukkit.entity.EntityType
import org.bukkit.entity.Player
import org.bukkit.entity.Projectile
import org.bukkit.entity.Villager
import org.bukkit.event.entity.EntityDamageEvent
import org.bukkit.event.player.PlayerTeleportEvent
import org.bukkit.inventory.EntityEquipment
import org.bukkit.inventory.Inventory
import org.bukkit.inventory.InventoryView
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.MainHand
import org.bukkit.inventory.Merchant
import org.bukkit.inventory.PlayerInventory
import org.bukkit.map.MapView
import org.bukkit.metadata.MetadataValue
import org.bukkit.permissions.Permission
import org.bukkit.permissions.PermissionAttachment
import org.bukkit.permissions.PermissionAttachmentInfo
import org.bukkit.plugin.Plugin
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType
import org.bukkit.scoreboard.Scoreboard
import org.bukkit.util.Vector
import java.net.InetSocketAddress
import java.util.UUID

interface FakePlayer : Player

fun fakePlayerOf(name: String): FakePlayer {
    class FakePlayer1 : FakePlayer {
        override fun setFireTicks(ticks: Int) {
        }

        override fun setTotalExperience(exp: Int) {
        }

        override fun getLastDamage(): Double {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun performCommand(command: String?): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setPassenger(passenger: Entity?): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun chat(msg: String?) {
        }

        override fun getMetadata(metadataKey: String?): MutableList<MetadataValue> {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun hasPotionEffect(type: PotionEffectType?): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun openMerchant(trader: Villager?, force: Boolean): InventoryView {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun openMerchant(merchant: Merchant?, force: Boolean): InventoryView {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getListeningPluginChannels(): MutableSet<String> {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setAllowFlight(flight: Boolean) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun abandonConversation(conversation: Conversation?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun abandonConversation(conversation: Conversation?, details: ConversationAbandonedEvent?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getVehicle(): Entity {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun stopSound(sound: Sound?) {
        }

        override fun stopSound(sound: String?) {
        }

        override fun stopSound(sound: Sound?, category: SoundCategory?) {
        }

        override fun stopSound(sound: String?, category: SoundCategory?) {
        }

        override fun updateInventory() {
        }

        override fun spigot(): Player.Spigot {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getLocation(): Location {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getLocation(loc: Location?): Location {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getEnderChest(): Inventory {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getHeight(): Double {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun isBlocking(): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setMetadata(metadataKey: String?, newMetadataValue: MetadataValue?) {
        }

        override fun isSleepingIgnored(): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun isSleeping(): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun resetMaxHealth() {
        }

        override fun getWalkSpeed(): Float {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun showPlayer(player: Player?) {
        }

        override fun showPlayer(plugin: Plugin?, player: Player?) {
        }

        override fun isGliding(): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getStatistic(statistic: Statistic?): Int {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getStatistic(statistic: Statistic?, material: Material?): Int {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getStatistic(statistic: Statistic?, entityType: EntityType?): Int {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getCanPickupItems(): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setDisplayName(name: String?) {
        }

        override fun getCustomName(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getEyeHeight(): Double {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getEyeHeight(ignorePose: Boolean): Double {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setItemInHand(item: ItemStack?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getFlySpeed(): Float {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun hasCooldown(material: Material?): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setSpectatorTarget(entity: Entity?) {
        }

        override fun setRemainingAir(ticks: Int) {
        }

        override fun hasPlayedBefore(): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun sendTitle(title: String?, subtitle: String?) {
        }

        override fun sendTitle(title: String?, subtitle: String?, fadeIn: Int, stay: Int, fadeOut: Int) {
        }

        override fun openEnchanting(location: Location?, force: Boolean): InventoryView {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getLastPlayed(): Long {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun isValid(): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun giveExpLevels(amount: Int) {
        }

        override fun playNote(loc: Location?, instrument: Byte, note: Byte) {
        }

        override fun playNote(loc: Location?, instrument: Instrument?, note: Note?) {
        }

        override fun setPlayerTime(time: Long, relative: Boolean) {
        }

        override fun getItemOnCursor(): ItemStack {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setShoulderEntityLeft(entity: Entity?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setWalkSpeed(value: Float) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setExhaustion(value: Float) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setHealthScaled(scale: Boolean) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setSilent(flag: Boolean) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setStatistic(statistic: Statistic?, newValue: Int) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setStatistic(statistic: Statistic?, material: Material?, newValue: Int) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setStatistic(statistic: Statistic?, entityType: EntityType?, newValue: Int) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setWindowProperty(prop: InventoryView.Property?, value: Int): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getFallDistance(): Float {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setFlySpeed(value: Float) {
        }

        override fun setOp(value: Boolean) {
        }

        override fun setRemoveWhenFarAway(remove: Boolean) {
        }

        override fun setSneaking(sneak: Boolean) {
        }

        override fun setScoreboard(scoreboard: Scoreboard?) {
        }

        override fun teleport(location: Location?): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun teleport(location: Location?, cause: PlayerTeleportEvent.TeleportCause?): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun teleport(destination: Entity?): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun teleport(destination: Entity?, cause: PlayerTeleportEvent.TeleportCause?): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setLeashHolder(holder: Entity?): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getExp(): Float {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun acceptConversationInput(input: String?) {
        }

        override fun getNoDamageTicks(): Int {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setFallDistance(distance: Float) {
        }

        override fun setNoDamageTicks(ticks: Int) {
        }

        override fun sendRawMessage(message: String?) {
        }

        override fun setWhitelisted(value: Boolean) {
        }

        override fun isFlying() = false

        override fun sendChunkChange(loc: Location?, sx: Int, sy: Int, sz: Int, data: ByteArray?): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setGlowing(flag: Boolean) {
        }

        override fun recalculatePermissions() {
        }

        override fun hasPermission(name: String?): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun hasPermission(perm: Permission?): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun isOnline(): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun isCustomNameVisible(): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setPlayerWeather(type: WeatherType?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun isEmpty(): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getSleepTicks(): Int {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getUniqueId(): UUID {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getInventory(): PlayerInventory {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getTicksLived(): Int {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setFlying(value: Boolean) {
        }

        override fun getEffectivePermissions(): MutableSet<PermissionAttachmentInfo> {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getOpenInventory(): InventoryView {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getMaxHealth(): Double {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getAttribute(attribute: Attribute?): AttributeInstance {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getPlayerWeather(): WeatherType {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun removeAttachment(attachment: PermissionAttachment?) {
        }

        override fun isInvulnerable(): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun spawnParticle(particle: Particle?, location: Location?, count: Int) {
        }

        override fun spawnParticle(particle: Particle?, x: Double, y: Double, z: Double, count: Int) {
        }

        override fun <T : Any?> spawnParticle(particle: Particle?, location: Location?, count: Int, data: T) {
        }

        override fun <T : Any?> spawnParticle(particle: Particle?, x: Double, y: Double, z: Double, count: Int, data: T) {
        }

        override fun spawnParticle(particle: Particle?, location: Location?, count: Int, offsetX: Double, offsetY: Double, offsetZ: Double) {
        }

        override fun spawnParticle(particle: Particle?, x: Double, y: Double, z: Double, count: Int, offsetX: Double, offsetY: Double, offsetZ: Double) {
        }

        override fun <T : Any?> spawnParticle(particle: Particle?, location: Location?, count: Int, offsetX: Double, offsetY: Double, offsetZ: Double, data: T) {
        }

        override fun <T : Any?> spawnParticle(particle: Particle?, x: Double, y: Double, z: Double, count: Int, offsetX: Double, offsetY: Double, offsetZ: Double, data: T) {
        }

        override fun spawnParticle(particle: Particle?, location: Location?, count: Int, offsetX: Double, offsetY: Double, offsetZ: Double, extra: Double) {
        }

        override fun spawnParticle(particle: Particle?, x: Double, y: Double, z: Double, count: Int, offsetX: Double, offsetY: Double, offsetZ: Double, extra: Double) {
        }

        override fun <T : Any?> spawnParticle(particle: Particle?, location: Location?, count: Int, offsetX: Double, offsetY: Double, offsetZ: Double, extra: Double, data: T) {
        }

        override fun <T : Any?> spawnParticle(particle: Particle?, x: Double, y: Double, z: Double, count: Int, offsetX: Double, offsetY: Double, offsetZ: Double, extra: Double, data: T) {
        }

        override fun closeInventory() {
        }

        override fun sendSignChange(loc: Location?, lines: Array<out String>?) {
        }

        override fun getExpToLevel() = 0

        override fun getSaturation() = 0.0F

        override fun setHealth(health: Double) {
        }

        override fun getShoulderEntityLeft(): Entity {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun removeMetadata(metadataKey: String?, owningPlugin: Plugin?) {
        }

        override fun getLastDamageCause(): EntityDamageEvent {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getPortalCooldown(): Int {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun isConversing(): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setMaximumAir(ticks: Int) {
        }

        override fun getLevel(): Int {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setBedSpawnLocation(location: Location?) {
        }

        override fun setBedSpawnLocation(location: Location?, force: Boolean) {
        }

        override fun isPermissionSet(name: String?): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun isPermissionSet(perm: Permission?): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getPassenger(): Entity {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun remove() {
        }

        override fun setMaxHealth(health: Double) {
        }

        override fun setTexturePack(url: String?) {
        }

        override fun setTicksLived(value: Int) {
        }

        override fun hasMetadata(metadataKey: String?): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getVelocity(): Vector {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getScoreboard(): Scoreboard {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun playEffect(loc: Location?, effect: Effect?, data: Int) {
        }

        override fun <T : Any?> playEffect(loc: Location?, effect: Effect?, data: T) {
        }

        override fun playEffect(type: EntityEffect?) {
        }

        override fun setSaturation(value: Float) {
        }

        override fun resetPlayerTime() {
        }

        override fun getServer() = Bukkit.getServer()

        override fun hasAI(): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun hidePlayer(player: Player?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun hidePlayer(plugin: Plugin?, player: Player?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getEyeLocation(): Location {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun kickPlayer(message: String?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun addPotionEffects(effects: MutableCollection<PotionEffect>?): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun isCollidable() = false

        override fun isWhitelisted() = true

        override fun setCompassTarget(loc: Location?) {
        }

        override fun getCompassTarget(): Location {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getPlayerTimeOffset() = 0L

        override fun isOnGround() = false

        override fun eject(): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getTotalExperience() = 0

        override fun openInventory(inventory: Inventory?): InventoryView {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun openInventory(inventory: InventoryView?) {
        }

        override fun isSprinting() = false

        override fun setLastDamage(damage: Double) {
        }

        override fun getPotionEffect(type: PotionEffectType?): PotionEffect {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun isInsideVehicle() = false

        override fun setPortalCooldown(cooldown: Int) {
        }

        override fun setGravity(gravity: Boolean) {
        }

        override fun setCooldown(material: Material?, ticks: Int) {
        }

        override fun getNearbyEntities(x: Double, y: Double, z: Double) = listOf<Entity>()

        override fun loadData() {
        }

        override fun sendMessage(message: String?) {
        }

        override fun sendMessage(messages: Array<out String>?) {
        }

        override fun sendBlockChange(loc: Location?, material: Material?, data: Byte) {
        }

        override fun sendBlockChange(loc: Location?, material: Int, data: Byte) {
        }

        override fun setSleepingIgnored(isSleeping: Boolean) {
        }

        override fun addAttachment(plugin: Plugin?, name: String?, value: Boolean): PermissionAttachment {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun addAttachment(plugin: Plugin?): PermissionAttachment {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun addAttachment(plugin: Plugin?, name: String?, value: Boolean, ticks: Int): PermissionAttachment {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun addAttachment(plugin: Plugin?, ticks: Int): PermissionAttachment {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getBedSpawnLocation(): Location {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun resetPlayerWeather() {
        }

        override fun giveExp(amount: Int) {
        }

        override fun setSprinting(sprinting: Boolean) {
        }

        override fun isGlowing() = false

        override fun getGameMode() = GameMode.SURVIVAL

        override fun setShoulderEntityRight(entity: Entity?) {
        }

        override fun isHealthScaled(): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setAI(ai: Boolean) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getAddress() = TODO("not implemented")

        override fun decrementStatistic(statistic: Statistic?) {
        }

        override fun decrementStatistic(statistic: Statistic?, amount: Int) {
        }

        override fun decrementStatistic(statistic: Statistic?, material: Material?) {
        }

        override fun decrementStatistic(statistic: Statistic?, material: Material?, amount: Int) {
        }

        override fun decrementStatistic(statistic: Statistic?, entityType: EntityType?) {
        }

        override fun decrementStatistic(statistic: Statistic?, entityType: EntityType?, amount: Int) {
        }

        override fun getAllowFlight() = false

        override fun getHealthScale() = 0.0

        override fun canSee(player: Player?) = false

        override fun playSound(location: Location?, sound: Sound?, volume: Float, pitch: Float) {
        }

        override fun playSound(location: Location?, sound: String?, volume: Float, pitch: Float) {
        }

        override fun playSound(location: Location?, sound: Sound?, category: SoundCategory?, volume: Float, pitch: Float) {
        }

        override fun playSound(location: Location?, sound: String?, category: SoundCategory?, volume: Float, pitch: Float) {
        }

        override fun getEquipment(): EntityEquipment {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getTargetBlock(transparent: MutableSet<Material>?, maxDistance: Int): Block {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setItemOnCursor(item: ItemStack?) {
        }

        override fun setCustomNameVisible(flag: Boolean) {
        }

        override fun <T : Projectile?> launchProjectile(projectile: Class<out T>?): T {
            TODO("unsupported")
        }

        override fun <T : Projectile?> launchProjectile(projectile: Class<out T>?, velocity: Vector?): T {
            TODO("unsupported")
        }

        override fun isBanned() = false

        override fun sendPluginMessage(source: Plugin?, channel: String?, message: ByteArray?) {
        }

        override fun isSneaking() = false

        override fun getMaximumAir(): Int {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun isOp(): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getLocale(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getPistonMoveReaction() = PistonMoveReaction.BREAK

        override fun addPassenger(passenger: Entity?): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getExhaustion(): Float {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setExp(exp: Float) {
        }

        override fun removeAchievement(achievement: Achievement?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getLineOfSight(transparent: MutableSet<Material>?, maxDistance: Int): MutableList<Block> {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getPlayerTime() = 0L

        override fun getLeashHolder(): Entity {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun isHandRaised(): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getCooldown(material: Material?): Int {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getSpectatorTarget(): Entity {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getType() = EntityType.PLAYER

        override fun getPlayer(): Player {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getScoreboardTags(): MutableSet<String> {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun saveData() {
        }

        override fun setCustomName(name: String?) {
        }

        override fun incrementStatistic(statistic: Statistic?) {
        }

        override fun incrementStatistic(statistic: Statistic?, amount: Int) {
        }

        override fun incrementStatistic(statistic: Statistic?, material: Material?) {
        }

        override fun incrementStatistic(statistic: Statistic?, material: Material?, amount: Int) {
        }

        override fun incrementStatistic(statistic: Statistic?, entityType: EntityType?) {
        }

        override fun incrementStatistic(statistic: Statistic?, entityType: EntityType?, amount: Int) {
        }

        override fun isPlayerTimeRelative(): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun removeScoreboardTag(tag: String?): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getActivePotionEffects(): MutableCollection<PotionEffect> {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getLastTwoTargetBlocks(transparent: MutableSet<Material>?, maxDistance: Int): MutableList<Block> {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun serialize(): MutableMap<String, Any> {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun hasLineOfSight(other: Entity?): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setMaximumNoDamageTicks(ticks: Int) {
        }

        override fun hasGravity(): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setCollidable(collidable: Boolean) {
        }

        override fun setCanPickupItems(pickup: Boolean) {
        }

        override fun isDead() = false

        override fun setGliding(gliding: Boolean) {
        }

        override fun hasAchievement(achievement: Achievement?): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getRemainingAir(): Int {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getAdvancementProgress(advancement: Advancement?): AdvancementProgress {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun isLeashed() = false

        override fun sendMap(map: MapView?) {
        }

        override fun awardAchievement(achievement: Achievement?) {
        }

        override fun setLevel(level: Int) {
        }

        override fun setFoodLevel(value: Int) {
        }

        override fun getRemoveWhenFarAway(): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun beginConversation(conversation: Conversation?): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun removePassenger(passenger: Entity?): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getMainHand(): MainHand {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getShoulderEntityRight(): Entity {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getPlayerListName(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setGameMode(mode: GameMode?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getName() = "#$name"

        override fun getKiller(): Player {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getItemInHand(): ItemStack {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getFoodLevel(): Int {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getMaxFireTicks(): Int {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setVelocity(velocity: Vector?) {
        }

        override fun getPassengers(): MutableList<Entity> {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun damage(amount: Double) {
        }

        override fun damage(amount: Double, source: Entity?) {
        }

        override fun setHealthScale(scale: Double) {
        }

        override fun getHealth(): Double {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun resetTitle() {
        }

        override fun getWorld(): World {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setLastDamageCause(event: EntityDamageEvent?) {
        }

        override fun addScoreboardTag(tag: String?): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getMaximumNoDamageTicks(): Int {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setPlayerListName(name: String?) {
        }

        override fun getEntityId(): Int {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getFireTicks(): Int {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getDisplayName(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setResourcePack(url: String?) {
        }

        override fun setResourcePack(url: String?, hash: ByteArray?) {
        }

        override fun removePotionEffect(type: PotionEffectType?) {
        }

        override fun leaveVehicle(): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun isSilent() = false

        override fun getWidth() = 0.0

        override fun openWorkbench(location: Location?, force: Boolean): InventoryView {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun setInvulnerable(flag: Boolean) {
        }

        override fun addPotionEffect(effect: PotionEffect?): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun addPotionEffect(effect: PotionEffect?, force: Boolean): Boolean {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getFirstPlayed() = 0L

        override fun hashCode(): Int {
            return name.hashCode()
        }

        override fun equals(other: Any?): Boolean {
            return other is FakePlayer && other.name == this.name
        }
    }

    return FakePlayer1()
}